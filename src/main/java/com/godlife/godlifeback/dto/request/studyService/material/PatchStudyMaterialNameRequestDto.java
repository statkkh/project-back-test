package com.godlife.godlifeback.dto.request.studyService.material;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatchMaterialNameReqeuestDto {
    
    @NotNull
    private int studyMaterialNumber;

    @NotBlank @Size(min = 2)
    private String studyMaterialName;
}