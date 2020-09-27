package myapp
import grails.rest.*

@Resource(uri='/books')
class Book {
    String title
    double price

    static graphql = true 
}