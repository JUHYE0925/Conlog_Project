package com.conlog.review.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.sql.Date;

@Schema(description = "리뷰 정보에 대한 DTO")
public class ReviewDTO {

    @Schema(description = "리뷰 번호(FK)")
    private int reviewNo;
    @Schema(description = "리뷰 작성한 날짜")
    private String reviewDate;
    @Schema(description = "리뷰 점수")
    private int reviewScore;
    @Schema(description = "리뷰 내용")
    private String reviewContent;
    @Schema(description = "작성한 회원 번호")
    private int memberNo;
    @Schema(description = "리뷰 대상 작품")
    private int contentsNo;

    public ReviewDTO(){}

    public ReviewDTO(int reviewNo, String reviewDate, int reviewScore, String reviewContent, int memberNo, int contentsNo) {
        this.reviewNo = reviewNo;
        this.reviewDate = reviewDate;
        this.reviewScore = reviewScore;
        this.reviewContent = reviewContent;
        this.memberNo = memberNo;
        this.contentsNo = contentsNo;
    }

    public int getReviewNo() {
        return reviewNo;
    }

    public void setReviewNo(int reviewNo) {
        this.reviewNo = reviewNo;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getContentsNo() {
        return contentsNo;
    }

    public void setContentsNo(int categoryNo) {
        this.contentsNo = categoryNo;
    }

    @Override
    public String toString() {
        return "ReviewDTO{" +
                "reviewNo=" + reviewNo +
                ", reviewDate=" + reviewDate +
                ", reviewScore=" + reviewScore +
                ", reviewContent='" + reviewContent + '\'' +
                ", memberNo=" + memberNo +
                ", contentsNo=" + contentsNo +
                '}';
    }
}
