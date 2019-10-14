package pl.bajda;

import java.util.Optional;

public class HelloService {
    static final String FALLBACK_NAME = "world";
    static final Lang FALLBACK_LANG = new Lang (1L, "Hello", "en");

    private LangRepository repository;

    String prepareGreeting(String name){
        return "Hello" + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
    }

}
