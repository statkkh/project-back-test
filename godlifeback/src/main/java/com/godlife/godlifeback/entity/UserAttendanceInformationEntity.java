package com.godlife.godlifeback.entity;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_attendance_information")
@Table(name = "user_attendance_information")
public class UserAttendanceInformationEntity {
    
    private int studyNumber;
    private String userEmail;
    private boolean userAttedencaCheck;
    private String ownerAttendanceStart;

    public UserAttendanceInformationEntity(Integer studyNumber, String email){
        Date now = Date.from(Instant.now());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String resisteredWriteDatetime  = simpleDateFormat.format(now);

        this.userEmail = email;
        this.studyNumber = studyNumber;
        this.userAttedencaCheck = true;
        this.ownerAttendanceStart = resisteredWriteDatetime;

    }

}
