package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.Library;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {


    public List<Library> libraryList() {
        ArrayList<Library> libraryArrayList = new ArrayList<>();
        Library book1 = new Library(1, "Test Title", "Stefan Villegas", 2026);
        Library book2 = new Library(2, "Eldslandet", "Pascal Engman", 2012);
        Library book3 = new Library(3, "Titanic", "Pelle pallsson", 1997);
        libraryArrayList.add(book1);
        libraryArrayList.add(book2);
        libraryArrayList.add(book3);
        return libraryArrayList;
    }
}
