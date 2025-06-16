package com.conlog.review.model.dao;

import com.conlog.review.model.dto.ReviewDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    List<ReviewDTO> selectAllMyReview(int myMemberNo);

    ReviewDTO selectOneReviewByReviewNo(int reviewNo);
}
