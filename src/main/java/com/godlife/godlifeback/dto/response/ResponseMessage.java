package com.godlife.godlifeback.dto.response;

public interface  ResponseMessage {
    String SUCCESS = "Succss.";
    
    String VALIDATION_FAILED = "Validation Failed.";

    String DUPLICATED_EMAIL = "Duplicated email.";
    String DUPLICATED_NICKNAME = "Duplicated nickname.";
    String DUPLICATED_PASSWORD = "Duplicated Password.";
    String DUPLICATED_CATEGORY = "Duplicated category.";
    String NOT_EXIST_USER = "This user does not exist";

    String SIGN_IN_FAILED = "Login information mismatch";
    String PASS_FAILED = "Confirm Password error.";
    String NO_PERMISSION = "Do not have permission.";
    
    String DATABASE_ERROR = "DataBase error.";

    String EMAIL_NOT_FOUND="Email not found.";
    String NOT_SAFE_PASSWORD = "Not safe password.";
    String NOT_EXIST_STUDY_MATERIAL = "This Study Material Number does not exist.";
    String NOT_EXIST_USER_LIST = "This User Number does not exist User List Number.";
    String NOT_EXIST_USER_ATTENDANCE_INFORMATION = "This User Attendance information does not exist.";  

    String NOT_EXIST_STUDY_ROOM = "This study room does not exist.";
    String NOT_JOIN_USER = "This user is not join in the study room.";
    String CANT_STUDY_DATE_MODIFY = "The next study date cannot be set to earlier than today.";

    String NOT_EXIST_NOTICE = "This notice does not exist.";
    String NOT_EXIST_TODOLIST = "This study todolist does not exist.";
    String NOT_EXIST_MATERIAL = "This study material comment does not exist.";

    String MISMATCH_LEADER_EMAIL = "The email does not match the study group leader's email.";

}
