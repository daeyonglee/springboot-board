package com.example.board.service;

import com.example.board.domain.type.SearchType;
import com.example.board.dto.ArticleDto;
import com.example.board.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks  private ArticleService sut;
    @Mock
    private ArticleRepository articleRepository;


    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환한다.")
    @Test
    void givenSearchingParameters_whenSearchingArticles_thenReturnsArticleList() {
        // Given

        // When
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); // 제목, 본문, ID, 닉네임, 해시태

        // Then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면, 게시글 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticles_thenReturnsArticle() {
        // Given

        // When
        ArticleDto article = sut.searchArticle(1L); // 제목, 본문, ID, 닉네임, 해시태

        // Then
        assertThat(article).isNotNull();
    }
}