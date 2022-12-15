package com.likezhen.chemlab.template;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.likezhen.chemlab.entity.TReaction;
import com.likezhen.chemlab.entity.TTemplate;
import com.likezhen.chemlab.mapper.TReactionMapper;
import com.likezhen.chemlab.mapper.TTemplateMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TemplateTest {
    @Autowired
    private TTemplateMapper templateMapper;

    @Test
    public void testTemplateInsert() {
        TTemplate template = new TTemplate(1, 10, "测试模版1", "data", LocalDateTime.now(), null, null);
        templateMapper.insert(template);
        assertThat(templateMapper.selectById(1)).isNotNull();
    }

    @Test
    public void testTemplateSelect() {
        TTemplate template = templateMapper.selectById(1);
        assertThat(template).isNotNull();
    }

    @Test
    public void testTemplateUpdate() {
        TTemplate template = new TTemplate(1, 10, "测试模版1", "data", LocalDateTime.now(), null, null);
        templateMapper.update(template, new UpdateWrapper<TTemplate>().eq("id", 1).set("name", "测试模版2"));
    }

    @Test
    public void testTemplateDelete() {
        int i = templateMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }

}
