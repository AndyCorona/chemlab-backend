package com.likezhen.chemlab.reaction;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.likezhen.chemlab.entity.TProject;
import com.likezhen.chemlab.entity.TReaction;
import com.likezhen.chemlab.mapper.TProjectMapper;
import com.likezhen.chemlab.mapper.TReactionMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReactionTest {
    @Autowired
    private TReactionMapper reactionMapper;

    @Test
    public void testReactionInsert() {
        TReaction reaction = new TReaction(1, 10, "[1,2,3]", null, null);
        reactionMapper.insert(reaction);
        assertThat(reactionMapper.selectById(1)).isNotNull();
    }

    @Test
    public void testReactionSelect() {
        TReaction reaction = reactionMapper.selectById(1);
        assertThat(reaction).isNotNull();
    }

    @Test
    public void testReactionUpdate() {
        TReaction reaction = new TReaction(1, 10, "[1,2,3]", null, null);
        reactionMapper.update(reaction, new UpdateWrapper<TReaction>().eq("id", 1).set("version_ids", "[1,2,3,4]"));
    }

    @Test
    public void testReactionDelete() {
        int i = reactionMapper.deleteById(1);
        assertThat(i).isNotEqualTo(0);
    }

}
