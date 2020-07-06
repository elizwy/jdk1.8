package tomap;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        Map<Integer, String> result = bookList.stream().collect(Collectors.toMap(Book::getReleaseYear, Book::getName,
                (existing, replacement) -> {throw new RuntimeException(existing+"与"+replacement+"同年");}));
        System.out.println(JSON.toJSONString(result));
    }
}
