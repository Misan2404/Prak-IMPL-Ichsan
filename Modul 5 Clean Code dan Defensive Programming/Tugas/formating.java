fill(80, 204, 55);
rect(100, 0, 200, 400);

var draw = function () {
    var numCircles = 6; // Jumlah lingkaran

    for (var i = numCircles; i > 1; i--) {
        var radius = i * 7;

        // Memeriksa posisi mouse
        if (mouseX > 100 && mouseX < 300) {
            fill(255, 255, 255); // Warna putih jika di dalam area
        } else {
            fill(80, 204, 55); // Warna hijau jika di luar area
        }

        // Menggambar lingkaran di posisi mouse
        ellipse(mouseX, mouseY, radius, radius);
    }
};
