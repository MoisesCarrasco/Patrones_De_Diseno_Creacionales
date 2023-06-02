import FactoryMethod.IDBAdapter
import FactoryMethod.MySqlDBAdapter
import FactoryMethod.OracleDBAdapter
import FactoryMethod.PostgreSqlDBAdapter
import Properties.PropertiesUtil
import java.util.*

fun main(args: Array<String>) {
    val property: Properties?= PropertiesUtil.loadProperty("properties/DBMySQL")
    println(property)
    val mySql: IDBAdapter=MySqlDBAdapter()
    println(mySql.getConnection().toString())

    val oracle: IDBAdapter= OracleDBAdapter()
    println(oracle.getConnection().toString())

    val postgres: IDBAdapter= PostgreSqlDBAdapter()
    println(postgres.getConnection().toString())
}