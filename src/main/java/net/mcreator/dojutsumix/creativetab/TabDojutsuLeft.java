
package net.mcreator.dojutsumix.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.dojutsumix.item.ItemCreativetablogo;
import net.mcreator.dojutsumix.ElementsDojutsumix;

@ElementsDojutsumix.ModElement.Tag
public class TabDojutsuLeft extends ElementsDojutsumix.ModElement {
	public TabDojutsuLeft(ElementsDojutsumix instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdojutsuleft") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCreativetablogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
