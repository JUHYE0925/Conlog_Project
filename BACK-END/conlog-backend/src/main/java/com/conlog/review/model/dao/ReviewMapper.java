package com.conlog.review.model.dao;

import com.conlog.review.model.dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {

    /* 나의 Review 전체 리스트 조회하기 */
    List<ReviewDTO> selectAllMyReview(int myMemberNo);

    /* memberNo, reviewNo를 통해 Review 상세 조회 */
    ReviewDTO selectOneReviewByReviewNo(int reviewNo);

    /* 새 리뷰 등록하기 */
    void registNewReview(ReviewDTO newReview);
}
