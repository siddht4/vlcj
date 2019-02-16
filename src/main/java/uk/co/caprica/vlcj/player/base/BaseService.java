/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player.base;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.binding.internal.libvlc_instance_t;
import uk.co.caprica.vlcj.binding.internal.libvlc_media_player_t;

// FIXME "Aspect" is gonna be better than "Service"

/**
 * Internal base implementation.
 */
abstract class BaseService {

    protected final DefaultMediaPlayer mediaPlayer;

    protected final LibVlc libvlc;

    protected final libvlc_instance_t libvlcInstance;

    protected final libvlc_media_player_t mediaPlayerInstance;

    protected BaseService(DefaultMediaPlayer mediaPlayer) {
        this.mediaPlayer         = mediaPlayer;
        this.libvlc              = mediaPlayer.libvlc;
        this.libvlcInstance      = mediaPlayer.libvlcInstance;
        this.mediaPlayerInstance = mediaPlayer.mediaPlayerInstance();
    }

    protected void release() {
    }

}
