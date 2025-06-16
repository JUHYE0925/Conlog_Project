package com.conlog.review.model.service;

import com.conlog.review.model.dao.ReviewMapper;
import com.conlog.review.model.dto.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewMapper reviewMapper;

    public ReviewService(ReviewMapper reviewMapper){
        this.reviewMapper = reviewMapper;
    }

    /* 나의 Review 전체 리스트 조회하기 */
    public List<ReviewDTO> selectAllMyReview(int myMemberNo) {

        return reviewMapper.selectAllMyReview(myMemberNo);
    }

    /* memberNo, reviewNo를 통해 Review 상세 조회 */
    public ReviewDTO selectOneReviewByReviewNo(int reviewNo) {

        return reviewMapper.selectOneReviewByReviewNo(reviewNo);
    }
}
