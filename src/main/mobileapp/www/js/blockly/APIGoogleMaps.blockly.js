window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.APIGoogleMaps = window.blockly.js.blockly.APIGoogleMaps || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.APIGoogleMaps.poligonal = function() {
 var item;
  this.cronapi.maps.drawPolygon("map1248", 'poligono', '-13.0129583,-38.487859,-13.0132878,-38.4887771,-13.0114682,-38.4890393', 'red', '0.4', 'gray', '0.6', '');
}

/**
 * APIGoogleMaps
 */
window.blockly.js.blockly.APIGoogleMaps.Executar = function() {
 var item;
  if (!this.cronapi.maps.isInitialized("map1248")) {
    this.cronapi.maps.init("map1248", 'roadmap', this.cronapi.maps.createLatLngPoint('-12.9935643', '-38.4945929'), '18', function(sender_item) {
        item = sender_item;
    }.bind(this));
  }
}
