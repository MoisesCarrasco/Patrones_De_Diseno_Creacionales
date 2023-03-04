package abstractFactory

import abstractFactory.EmployeeServiceWSImpl

class WSServiceStackImpl: IServiceStackAbstractFactory {
    override fun getEmployeeService(): IEmployeeService = EmployeeServiceWSImpl()
    override fun getProductsService(): IProductService = ProductServiceWSImpl()
}