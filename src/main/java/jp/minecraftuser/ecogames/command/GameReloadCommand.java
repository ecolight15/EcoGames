package jp.minecraftuser.ecogames.command;

import jp.minecraftuser.ecoframework.PluginFrame;
import jp.minecraftuser.ecoframework.CommandFrame;
import static jp.minecraftuser.ecoframework.Utl.sendPluginMessage;
import org.bukkit.command.CommandSender;

/**
 * game reloadコマンドクラス
 * @author ecolight
 */
public class GameReloadCommand extends CommandFrame {

    /**
     * コンストラクタ
     * @param plg_ プラグインインスタンス
     * @param name_ コマンド名
     */
    public GameReloadCommand(PluginFrame plg_, String name_) {
        super(plg_, name_);
        setAuthBlock(true);
        setAuthConsole(true);
    }

    /**
     * コマンド権限文字列設定
     * @return 権限文字列
     */
    @Override
    public String getPermissionString() {
        return "ecogames.reload";
    }

    /**
     * 処理実行部
     * @param sender コマンド送信者
     * @param args パラメタ
     * @return コマンド処理成否
     */
    @Override
    public boolean worker(CommandSender sender, String[] args) {
        // パラメータチェック:0のみ
        if (!checkRange(sender, args, 0, 0)) return true;

        // リロード
        plg.reload();
        sendPluginMessage(plg, sender, "コンフィグリロード");
        return true;
    }
    
}