### Added new validation rules for product 
[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=coverage)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5) 
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=code_smells)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=bugs)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5) 
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javaGuruBY_java-free-stream-5&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=javaGuruBY_java-free-stream-5)  

1. Create the following classes:  
        a. Author with fields:   
            ▪ String name  
            ▪ short age  
            ▪ List<Book> books  
        b. Book with fields  
    • String title  
    • List<Author> authors  
    • int numberOfPages  
2. Create two arrays: Author[] authors and Book[] books. Their elements must use elements from the neighboring array.
3. Create a stream of books and then:  
    I. check if some/all book(s) have more than 200 pages;
    II. find the books with max and min number of pages;
    III. filter books with only single author;
    IV. sort the books by number of pages/title;
    V. get list of all titles;
    VI. print them using forEach method;
    VII. get distinct list of all authors
4. Use peek method for debugging intermediate streams during execution the previous task.
5. Use parallel stream with subtask #3.
6. Analyze with mentor results of previous subtask execution, explain him the difference between stream and parallel stream.
7. Use the Optional type for determining the title of the biggest book of some author.


