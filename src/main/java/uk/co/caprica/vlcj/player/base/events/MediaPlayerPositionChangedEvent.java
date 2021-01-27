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
 * afloat with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2021 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player.base.events;

import uk.co.caprica.vlcj.binding.internal.libvlc_event_t;
import uk.co.caprica.vlcj.binding.internal.media_player_position_changed;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventListener;

/**
 * Encapsulation of a media player position changed event.
 */
final class MediaPlayerPositionChangedEvent extends MediaPlayerEvent {

    private final float newPosition;

    MediaPlayerPositionChangedEvent(MediaPlayer mediaPlayer, libvlc_event_t event) {
        super(mediaPlayer);
        this.newPosition = ((media_player_position_changed) event.u.getTypedValue(media_player_position_changed.class)).new_position;
    }

    @Override
    public void notify(MediaPlayerEventListener listener) {
        listener.positionChanged(mediaPlayer, newPosition);
    }

}
