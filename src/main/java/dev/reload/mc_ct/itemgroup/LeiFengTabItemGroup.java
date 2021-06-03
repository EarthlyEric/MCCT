
package dev.reload.mc_ct.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import dev.reload.mc_ct.item.LeiFengWorldItem;
import dev.reload.mc_ct.McCtModElements;

@McCtModElements.ModElement.Tag
public class LeiFengTabItemGroup extends McCtModElements.ModElement {
	public LeiFengTabItemGroup(McCtModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablei_feng_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LeiFengWorldItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
