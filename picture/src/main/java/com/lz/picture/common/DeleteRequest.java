package com.lz.picture.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Project: picture
 * Package: com.lz.picture.common
 * Author: YY
 * CreateTime: 2025-02-01  16:31
 * Description: DeleteRequest
 * Version: 1.0
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
