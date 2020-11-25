package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);
        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this, 2));

        ArrayList<Book> books = new ArrayList<>();
        //books.add(new Book(1, "1Q84", "Haruki Murakami",150, "", "", ""  ))
        books.add(new Book(1, "1Q84", "Haruki Murakami", 1350,
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1483103331l/10357575.jpg",
                "A work of maddening brilliance", "Long Description"));
        books.add(new Book(2, "Animal Farm", "George Orwell", 150,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Animal_Farm_-_1st_edition.jpg/220px-Animal_Farm_-_1st_edition.jpg",
                "A brilliant work", "My Long Description"));
        adapter.setBooks(books);


    }
}