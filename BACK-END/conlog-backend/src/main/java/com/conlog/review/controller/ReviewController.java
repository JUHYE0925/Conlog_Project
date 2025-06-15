package com.conlog.review.controller;

import com.conlog.common.ResponseMessage;
import com.conlog.review.model.dto.ReviewDTO;
import com.conlog.review.model.service.ReviewService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name = "Conlog Swagger 연동(review)")
@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService){
        this.reviewService = reviewService;
    }

    /* Review 전체 조회 */
    // 내가 작성한 것들만 불러오기 - 단 지금은 로그인/회원가입 기능 구현 전이니 임의의 값을 넘겨서 불러오기 -> 일단 1번 회원의 것만 가져오기
    @Operation(summary = "전체 리뷰 목록 조회", description = "내가 작성한 전체 리뷰 목록 조회한다.")
    @GetMapping("/selectAll")
    public ResponseEntity<ResponseMessage> selectAllMyReviews(){

        /* 응답 헤더 설정 */
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        // 임시 값. 로그인 기능 완료 되면 값 재설정하기.
        int myMemberNo = 1;

        List<ReviewDTO> reviewList = reviewService.selectAllMyReview(myMemberNo);

        /* 응답 데이터 설정 */
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("reviewList",  reviewList);

        System.out.println("reviewList = " + reviewList);

        ResponseMessage responseMessage = new ResponseMessage(200, "조회 성공", responseMap);

        return new ResponseEntity(responseMessage, headers, HttpStatus.OK);
    }

}
