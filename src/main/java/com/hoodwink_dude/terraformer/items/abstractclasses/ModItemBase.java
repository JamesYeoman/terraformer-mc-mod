package com.hoodwink_dude.terraformer.items.abstractclasses;

import net.minecraft.item.Item;

import static com.hoodwink_dude.terraformer.utils.Constants.MODID;

public class ModItemBase extends Item {
	public final String BaseName;
	
	protected ModItemBase(String name) {
		setRegistryName(name);
		BaseName = getRegistryName().toString();
		setUnlocalizedName(MODID.concat(".").concat(name));
	}
}
