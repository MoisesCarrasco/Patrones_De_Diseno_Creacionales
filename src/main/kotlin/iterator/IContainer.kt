package iterator

import IIterator

interface IContainer<T> {
    fun createIterator(): IIterator<T>?
}
