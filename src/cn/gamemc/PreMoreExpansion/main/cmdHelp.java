package cn.gamemc.PreMoreExpansion.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmdHelp implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// ����ǰ׺
		if ( cmd.getName().equalsIgnoreCase("morexhelp") ) {
			// ��ֹ��̨����
			if ( !(sender instanceof Player) ) {
				sender.sendMessage("�����ڿ���̨ʹ��");
				return true;
		    }
			// ת��
			Player p = (Player) sender;
			// �޲���
			if ( args.length == 0 ) {
		      p.sendMessage("��f");
		      p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		      p.sendMessage("��f   ��a��l������� ��71/1ҳ");
		      p.sendMessage("��f      /morexhelp ҳ��   ��7�鿴����");
		      p.sendMessage("��f      /morexgive ��ƷID ���ID ����    ��7������Ʒ");
		      p.sendMessage("��f");
		      return true;
		    }
			// �в����ҳ�������
		    if ( args.length > 1 ) {
		    	p.sendMessage("��f");
		    	p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
			    p.sendMessage("��f   ��c��l�������");
			    p.sendMessage("��7      ��ȷ��ʽ����f/morexhelp ҳ��");
			    p.sendMessage("��f");
			    return true;
		    }
		    // �в�������ȷ����
		    if ( args.length == 1 ) {
		      // �ж�����
		    	int helpInt = 0;
		    	try {
		    		// ������
			        helpInt = Integer.parseInt(args[0]);
		    	}catch (NumberFormatException er)
			    {
		    		//������
		    		p.sendMessage("��f");
				    p.sendMessage("��f  ��7��l[��6��lMoreExpansion��7��l]");
				    p.sendMessage("��f  ��c��l�������");
				    p.sendMessage("��7    ��ȷ��ʽ����f/mion help ҳ��");
				    p.sendMessage("��f");
				    return true;
				}
		    	  // ���ִ���0
			      if ( helpInt > 0 ) {
			    	  // ��1ҳ����
			    	  if ( args[0].equalsIgnoreCase("1") ) {
			    		  p.sendMessage("��f");
				          p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
				          p.sendMessage("��f   ��a��l������� ��71/1ҳ");
				          p.sendMessage("��f      /morexhelp ҳ��   ��7�鿴����");
				          p.sendMessage("��f      /morexgive ��ƷID ���ID ����    ��7������Ʒ");
				          p.sendMessage("��f");
				          return true;
			          }
			    	  if ( args[0].equalsIgnoreCase("2") ) {
				    	  // ��2ҳ����
			    		  return true;
			    	  }
			    	  return true;
			      }
			      p.sendMessage("��f");
			      p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
			      p.sendMessage("��f   ��a��l������� ��71/1ҳ");
			      p.sendMessage("��f      /morexhelp ҳ��   ��7�鿴����");
			      p.sendMessage("��f      /morexgive ��ƷID ���ID ����    ��7������Ʒ");
			      p.sendMessage("��f");
			      return true;
		    }
		}
		return false;
	}
}
