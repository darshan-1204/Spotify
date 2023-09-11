package com.example.spotify.Api

    data class SpotifyModel(
        val data: List<ResultItem>
    )

    data class ResultItem(
        val id: String,             // Unique identifier for the result
        val name: String,           // Name of the item (e.g., song, album, artist)
        val artist: String,         // Name of the artist or creator
        val album: String,          // Name of the album (if applicable)
        val releaseDate: String,    // Release date of the item
        val imageUrl: String,       // URL to an image representing the item (cover art, artist photo, etc.)
        val previewUrl: String      // URL to a preview audio clip of the item
    )
