package griffio

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.asJdbcDriver

import org.postgresql.ds.PGSimpleDataSource

import griffio.queries.Sample

private fun getSqlDriver(): SqlDriver {
    val datasource = PGSimpleDataSource()
    datasource.setURL("jdbc:postgresql://localhost:5432/sampledb")
    datasource.applicationName = "App Main"
    return datasource.asJdbcDriver()
}

fun main() {

    val driver = getSqlDriver()
    val sample = Sample(driver)

    sample.cityQueries.insert("A")
    sample.cityQueries.insert("B")
    sample.cityQueries.insert("C")

    sample.cityQueries.select().executeAsList().forEach { println(it) }

    val count = sample.cityQueries.delete().executeAsOne()

    println("rows deleted $count")

    sample.cityQueries.select().executeAsList().forEach { println(it) } // no rows

}
