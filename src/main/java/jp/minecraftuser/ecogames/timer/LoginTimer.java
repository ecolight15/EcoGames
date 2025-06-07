package jp.minecraftuser.ecogames.timer;

import jp.minecraftuser.ecoframework.PluginFrame;
import jp.minecraftuser.ecoframework.TimerFrame;
import org.bukkit.entity.Player;

/**
 * ログインタイマークラス
 * @author ecolight
 */
public class LoginTimer extends TimerFrame {

    /**
     * コンストラクタ
     * @param plg_ プラグインインスタンス
     * @param player_ プレイヤー
     * @param name_ 名前
     */
    public LoginTimer(PluginFrame plg_, Player player_, String name_) {
        super(plg_, player_, name_);
    }

    /**
     * 非同期処理メイン
     */
    @Override
    public void run()
    {
        // TODO: 非同期処理の内容を実装する
        // 例: ログインメッセージの表示、初期化処理など
    }
}