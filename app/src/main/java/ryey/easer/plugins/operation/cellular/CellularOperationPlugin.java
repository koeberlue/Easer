/*
 * Copyright (c) 2016 - 2018 Rui Zhao <renyuneyun@gmail.com>
 *
 * This file is part of Easer.
 *
 * Easer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Easer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Easer.  If not, see <http://www.gnu.org/licenses/>.
 */

package ryey.easer.plugins.operation.cellular;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import ryey.easer.R;
import ryey.easer.commons.plugindef.PluginViewFragment;
import ryey.easer.commons.plugindef.operationplugin.OperationDataFactory;
import ryey.easer.commons.plugindef.operationplugin.OperationLoader;
import ryey.easer.commons.plugindef.operationplugin.OperationPlugin;
import ryey.easer.commons.plugindef.operationplugin.PrivilegeUsage;

public class CellularOperationPlugin implements OperationPlugin<CellularOperationData> {

    @NonNull
    @Override
    public String id() {
        return "cellular";
    }

    @Override
    public int name() {
        return R.string.operation_cellular;
    }

    @Override
    public boolean isCompatible(@NonNull final Context context) {
        return true;
    }

    @NonNull
    @Override
    public PrivilegeUsage privilege() {
        return PrivilegeUsage.prefer_root;
    }

    @Override
    public int maxExistence() {
        return 1;
    }

    @Override
    public boolean checkPermissions(@NonNull Context context) {
        return true;
    }

    @Override
    public void requestPermissions(@NonNull Activity activity, int requestCode) {

    }

    @NonNull
    @Override
    public OperationDataFactory<CellularOperationData> dataFactory() {
        return new CellularOperationDataFactory();

    }

    @NonNull
    @Override
    public PluginViewFragment<CellularOperationData> view() {
        return new CellularPluginViewFragment();
    }

    @NonNull
    @Override
    public OperationLoader<CellularOperationData> loader(@NonNull Context context) {
        return new CellularLoader(context);
    }

}
