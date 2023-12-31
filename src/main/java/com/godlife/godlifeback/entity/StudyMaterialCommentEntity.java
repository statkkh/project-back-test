package com.godlife.godlifeback.entity;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.godlife.godlifeback.dto.request.study.PatchMaterialCommentReqeuestDto;
import com.godlife.godlifeback.dto.request.study.PostMaterialCommentRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "study_material_comment")
@Table(name = "study_material_comment")
public class StudyMaterialCommentEntity {
    
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int studyMaterialCommentNumber;

    private int studyMaterialNumber;
    private String userEmail;
    private String studyMaterialCommentContent;
    private String studyMaterialCommentDatetime;

    public StudyMaterialCommentEntity(PostMaterialCommentRequestDto dto, String userEmail, Integer studyMaterialNumber){
        Date now = Date.from(Instant.now());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String writeDatetime = simpleDateFormat.format(now);  
        
        this.studyMaterialNumber = studyMaterialNumber;
        this.userEmail = userEmail;
        this.studyMaterialComment = dto.getStudyMaterialCommentContent();
        this.studyMaterialCommentDatetime = writeDatetime;
    }


    public void patch(PatchMaterialCommentReqeuestDto dto){

        this.studyMaterialCommentContent = dto.getStudyMaterialCommentContent();

        Date now = Date.from(Instant.now());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String writeDatetime = simpleDateFormat.format(now);

        this.studyMaterialCommentDatetime = writeDatetime;
    }



}
