package com.godlife.godlifeback.dto.response.studyService.materialComment;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.godlife.godlifeback.common.object.StudyMaterialCommentListItem;
import com.godlife.godlifeback.dto.response.ResponseCode;
import com.godlife.godlifeback.dto.response.ResponseDto;
import com.godlife.godlifeback.dto.response.ResponseMessage;
import com.godlife.godlifeback.repository.resultSet.StudyCommentListResultSet;

import lombok.Getter;

@Getter
public class GetStudyMaterialCommentResponseDto extends ResponseDto{

    
    private List<StudyMaterialCommentListItem> materialCommentList; 

    private GetMaterialCommentResponseDto(String code, String message, List<StudyCommentListResultSet> resultSets){
        super(code, message);
        this.materialCommentList = StudyMaterialCommentListItem.getMaterialCommentList(resultSets);
    }

    public static ResponseEntity<GetMaterialCommentResponseDto> success(List<StudyCommentListResultSet> resultSets){
        GetMaterialCommentResponseDto result = new GetMaterialCommentResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, resultSets);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> notExistsUser(){
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXIST_USER, ResponseMessage.NOT_EXIST_USER);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
    
    public static ResponseEntity<ResponseDto> notExistsStudy(){
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXIST_STUDY_ROOM, ResponseMessage.NOT_EXIST_STUDY_ROOM);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    

}
