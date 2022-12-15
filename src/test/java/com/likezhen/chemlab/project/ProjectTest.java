package com.likezhen.chemlab.project;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.likezhen.chemlab.ChemlabApplication;
import com.likezhen.chemlab.entity.TProject;
import com.likezhen.chemlab.mapper.TProjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProjectTest {
    @Autowired
    private TProjectMapper projectMapper;

    @Test
    public void testProjectInsert() {
        TProject project = new TProject(1, "测试项目", LocalDateTime.now(), 1, "[1,2,3]", false, null, null);
        projectMapper.insert(project);
        assertThat(projectMapper.selectById(1)).isNotNull();
    }

    @Test
    public void testProjectSelect() {
        TProject project = projectMapper.selectById(1);
        assertThat(project).isNotNull();
    }

    @Test
    public void testProjectUpdate() {
        TProject project = new TProject(1, "测试项目2", LocalDateTime.now(), 1, "[1,2,3]", false, null, null);
        projectMapper.update(project, new UpdateWrapper<TProject>().eq("id", 1).set("name", "测试项目2"));
    }

    @Test
    public void testProjectDelete() {
        int i = projectMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }

}
