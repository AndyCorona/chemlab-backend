package com.likezhen.chemlab.version;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.likezhen.chemlab.entity.TGroup;
import com.likezhen.chemlab.entity.TProject;
import com.likezhen.chemlab.entity.TVersion;
import com.likezhen.chemlab.mapper.TVersionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class VersionTest {
    @Autowired
    private TVersionMapper versionMapper;

    @Test
    public void testVersionInsert() {
        TVersion version = new TVersion(1, LocalDateTime.now(), "tag1,tag2,tag3", 10, "测试版本1", "data", LocalDateTime.now(), null, null);
        versionMapper.insert(version);
        assertThat(versionMapper.selectById(1)).isNotNull();

    }

    @Test
    public void testVersionSelect() {
        TVersion version = versionMapper.selectById(1);
        assertThat(version).isNotNull();
    }

    @Test
    public void testVersionUpdate() {
        TVersion version = new TVersion(1, LocalDateTime.now(), "[]", 10, "测试版本1", "data", LocalDateTime.now(), null, null);
        versionMapper.update(version, new UpdateWrapper<TVersion>().eq("id", 1).set("name", "测试版本2"));
    }

    @Test
    public void testVersionDelete() {
        int i = versionMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }
}
