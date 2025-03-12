package com.interrupt.dungeoneer.entities.items;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector3;
import com.interrupt.dungeoneer.Audio;
import com.interrupt.dungeoneer.annotations.EditorProperty;
import com.interrupt.dungeoneer.entities.*;
import com.interrupt.dungeoneer.entities.triggers.BasicTrigger;
import com.interrupt.dungeoneer.game.CachePools;
import com.interrupt.dungeoneer.game.Game;
import com.interrupt.dungeoneer.game.Level;

import java.util.Random;

public class Shield extends Item {

	public Shield() { isSolid = true; chargeAnimation = "shieldBlock"; equipSound = "/ui/ui_equip_item.mp3"; }

	public ProjectedDecal hitDecal = new ProjectedDecal(ArtType.sprite, 18, 1.0f);

	public Shield(float x, float y) {
		super(x, y, 8, ItemType.shield, "SHIELD");
	}

	/** Sound played when Shield blocks projectile */
	@EditorProperty
	public String blockSound = "clang.mp3,clang_02.mp3,clang_03.mp3,clang_04.mp3";

    @EditorProperty
    public String chargeAnimation = null;

    @EditorProperty
    private float blockTime = 1.5f;

    @Override
    public void AttackPressed(Player user)
    {
        user.gainInvincibility(blockTime);
    }


}
