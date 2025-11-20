package org.example.boardback.dto.board.file;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardFileUpdateRequestDto {
    private List<Long> keepFileIds;
    private List<MultipartFile> newFiles; // 새로 추가되는 파일
}
