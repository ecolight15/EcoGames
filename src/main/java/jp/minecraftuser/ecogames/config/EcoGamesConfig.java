package jp.minecraftuser.ecogames.config;

import jp.minecraftuser.ecoframework.PluginFrame;
import jp.minecraftuser.ecoframework.ConfigFrame;

/**
 * ecogames設定ファイル
 * @author ecolight
 */
public class EcoGamesConfig extends ConfigFrame {

    public EcoGamesConfig(PluginFrame plg_) {
        super(plg_);
        plg.registerNotifiable(this);
    }

    /**
     * リロード処理
     * @param base 基底クラス動作指定
     */
    @Override
    public void reloadNotify(boolean base) {
        if (base) {
            super.reload();
        } else {
            
        }
    }
}