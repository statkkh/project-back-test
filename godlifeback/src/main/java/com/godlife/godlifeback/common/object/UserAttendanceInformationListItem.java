package com.godlife.godlifeback.common.object;

import java.util.ArrayList;
import java.util.List;

import com.godlife.godlifeback.repository.resultSet.UserAttendanceInformationResultset;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAttendanceInformationListItem {
    private int studyNumber;
    private String userEmail;
    private String userGrade;
    private String userProfileImage;
    private String userNickName;
    private String userAttendanceCheck;
    private String ownerAttendanceStart;

    public UserAttendanceInformationListItem(UserAttendanceInformationResultset resultSet){
        // Date now = Date.from(Instant.now());
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        // String resisteredWriteDatetime = simpleDateFormat.format(now);

        this.userNickName = resultSet.getNickname();
        this.userEmail = resultSet.getUserEmail();
        this.userProfileImage = resultSet.getUserProfileImage();
        this.userNickName = resultSet.getNickname();
        this.userAttendanceCheck = resultSet.getUserAttendanceCheck();
        this.ownerAttendanceStart = resultSet.getOwnerAttendanceStart();
    }

    public static List<UserAttendanceInformationListItem> getUserAttendanceInformationList(List<UserAttendanceInformationResultset> resultSets){
        List<UserAttendanceInformationListItem> list = new ArrayList<>();
        for(UserAttendanceInformationResultset resultSet : resultSets){
            UserAttendanceInformationListItem userAttendanceInformationListItem = new UserAttendanceInformationListItem(resultSet);
            list.add(userAttendanceInformationListItem);
        }
        return list;
    }
}
