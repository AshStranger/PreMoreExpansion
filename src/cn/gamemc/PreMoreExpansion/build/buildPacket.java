package cn.gamemc.PreMoreExpansion.build;

import java.lang.reflect.InvocationTargetException;

import org.bukkit.entity.Player;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.TitleAction;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

import cn.gamemc.PreMoreExpansion.main.main;

public class buildPacket {

	public static void sendTitle(Player player, String mainText, String subText,int fadeIn, int stay, int fadeOut) {
		PacketContainer mainTitle = new PacketContainer(PacketType.Play.Server.TITLE);
		mainTitle.getTitleActions().write(0, TitleAction.TITLE);
		mainTitle.getChatComponents().write(0, WrappedChatComponent.fromText(mainText));
		
		PacketContainer subTitle = new PacketContainer(PacketType.Play.Server.TITLE);
		subTitle.getTitleActions().write(0, TitleAction.SUBTITLE);
		subTitle.getChatComponents().write(0, WrappedChatComponent.fromText(subText));
		
		PacketContainer timeTitle = new PacketContainer(PacketType.Play.Server.TITLE);
		timeTitle.getTitleActions().write(0, TitleAction.TIMES);
		timeTitle.getIntegers().write(0, fadeIn);
		timeTitle.getIntegers().write(1, stay);
		timeTitle.getIntegers().write(2, fadeOut);
		
		try {
			main.pm.sendServerPacket(player, timeTitle);
			main.pm.sendServerPacket(player, mainTitle);
			main.pm.sendServerPacket(player, subTitle);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
