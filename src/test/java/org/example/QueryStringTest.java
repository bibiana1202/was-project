package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {
    // operand1=11&operator=*&operand2=55
    @Test
    void createTest() {

        QueryString queryString = new QueryString("operand","11");

        assertThat(queryString).isNotNull();
    }
}
