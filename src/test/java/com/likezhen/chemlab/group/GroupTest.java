package com.likezhen.chemlab.group;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.likezhen.chemlab.entity.TGroup;
import com.likezhen.chemlab.entity.TProject;
import com.likezhen.chemlab.mapper.TGroupMapper;
import com.likezhen.chemlab.mapper.TProjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class GroupTest {
    @Autowired
    private TGroupMapper groupMapper;

    @Test
    public void testGroupInsert() {
        TGroup group = new TGroup(1, "1234567891", "测试群组", "测试群组简介", "[1,2,3]", "[1,2,3]", LocalDateTime.now(), 10, null, null);
        groupMapper.insert(group);
        assertThat(groupMapper.selectById(1)).isNotNull();
    }

    @Test
    public void testGroupSelect() {
        TGroup group = groupMapper.selectById(1);
        assertThat(group).isNotNull();
    }

    @Test
    public void testGroupUpdate() {
        TGroup group = new TGroup(1, "1234567891", "测试群组", "测试群组简介", "[1,2,3]", "[1,2,3]", LocalDateTime.now(), 10, null, null);
        groupMapper.update(group, new UpdateWrapper<TGroup>().eq("id", 1).set("name", "测试群组2"));
    }

    @Test
    public void testGroupDelete() {
        int i = groupMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }

}
