/*
- Homework 2
- **Research and Practice**
- Create a class related to Library Book
- Add Primary constructor (isbn, title, author, bookGenre, isAvailable)
- Add few methods (onBorrow, onReturn, onReserve, onMarkLost)
- Create 5 instances
     - Science Fiction Book
     - History Book
     - Programming Textbook
     - Biography Book
     - Comic / Graphic Novel
- Add init block to perform operations such as validation (e.g., ISBN length check, title and author cannot be empty)
*/

package com.core.Homework

class LibraryBook(
    var isbn: String,
    var title: String,
    var author: String,
    var bookGenre: String,
    var isAvailable: Boolean
)


 