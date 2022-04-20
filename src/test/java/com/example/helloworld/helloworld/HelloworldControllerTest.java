package com.example.helloworld.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// SpringBootベースのテストを実行するテストクラスで指定できるアノテーション。
@SpringBootTest
// MockMvcの自動構成を有効にして構成するためにテストクラスに適用できる注釈。
@AutoConfigureMockMvc
public class HelloworldControllerTest {

    @Test
    // MockMvc ↓
    // サーバー側のSpringMVCテストサポートのメインエントリポイント。
    void sampleTest(@Autowired MockMvc mvc) throws Exception {

        //リクエストを実行し、結果に対して期待を表明するなど、
        // さらなるアクションを連鎖させることができるタイプを返します。
        mvc.perform(
                // RequestBuildersの静的ファクトリメソッド。
                // SpringTestContextフレームワークとの統合
                // このクラスのメソッドは、SpringTestContextFrameworkによって作成されたMockServletContextを再利用します。
                MockMvcRequestBuilders.get("/"))

                // ResultMatcherベースの結果アクションの静的ファクトリメソッド。
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("helloworld"));
    }
}
