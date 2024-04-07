package com.backend.notesharing.util;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class GenericResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public static <T> GenericResponse<T> empty(){
        return success(null);
    }

    public static <T> GenericResponse<T> success(T data) {
        return GenericResponse.<T>builder()
                .message("SUCCESS!")
                .data(data)
                .success(true)
                .build();
    }

    public static <T> GenericResponse<T> success(T data, String message) {
        return GenericResponse.<T>builder()
                .message(message)
                .data(data)
                .success(true)
                .build();
    }

    public static <T> GenericResponse<T> error() {
        return GenericResponse.<T>builder()
                .message("ERROR!")
                .success(false)
                .build();
    }
}
