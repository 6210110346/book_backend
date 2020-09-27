package myapp

class MyController {
    def greet(){
        render "Hello world";
    }

    def createBook(String title){
        def book = new Book(title: title, price: 0)
        book.save(flush: true)
        render 'ok'
    }
}