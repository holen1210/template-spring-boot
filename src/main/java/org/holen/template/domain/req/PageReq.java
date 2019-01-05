package org.holen.template.domain.req;

import com.github.pagehelper.IPage;
import lombok.Getter;
import lombok.Setter;

/**
 * 所有的分页查询需要继承自PageREQ
 *
 * @author holen
 * @date 2018/12/06
 */
@Getter
@Setter
public class PageReq implements IPage {
    private static Integer DEFAULT_PAGE_NUM = 0;
    private static Integer DEFAULT_PAGE_SIZE = 10;
    private Integer pageNum = DEFAULT_PAGE_NUM;
    private Integer pageSize = DEFAULT_PAGE_SIZE;
    private String orderBy;
}
