package hello.itemservice.validation;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;

public class MessageCodesResolverTest {

    MessageCodesResolver codesResolver = new DefaultMessageCodesResolver();

    @Test
    void messageCodesResolverObject(){
        String[] message = codesResolver.resolveMessageCodes("required", "item");

        Assertions.assertThat(message).containsExactly("required.item","required");
    }

    @Test
    void messageCodesResolverField(){
        String[] message = codesResolver.resolveMessageCodes("required", "item", "itemName", String.class);
        Assertions.assertThat(message).containsExactly("required.item.itemName","required.itemName","required.java.lang.String","required");
    }
}
