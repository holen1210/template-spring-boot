package org.holen.template.domain.req;

import lombok.Getter;

/**
 * 所有的分页查询需要继承自PageREQ
 *
 * @author holen
 * @date 2018/12/06
 */
@Getter
public class PageREQ {
    private static final Integer DEFAULT_LIMIT = 20;
    private static final Integer DEFAULT_OFFSET = 0;
    private Integer limit;
    private Integer offset;

    public PageREQ() {
    }

    public PageREQ(Integer limit, Integer offset) {
        if (limit < 0) {
            this.limit = DEFAULT_LIMIT;
        } else {
            this.limit = limit;
        }
        if (offset < 0) {
            this.offset = DEFAULT_OFFSET;
        } else {
            this.offset = offset;
        }
    }

    public void setLimit(Integer limit) {
        if (limit < 0) {
            this.limit = DEFAULT_LIMIT;
        } else {
            this.limit = limit;
        }
    }

    public void setOffset(Integer offset) {
        if (offset < 0) {
            this.offset = DEFAULT_OFFSET;
        } else {
            this.offset = offset;
        }
    }
}
