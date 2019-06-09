window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.APIGoogleMaps = window.blockly.js.blockly.APIGoogleMaps || {};

/**
 * APIGoogleMaps
 */
window.blockly.js.blockly.APIGoogleMaps.Executar = function() {
 var item;
  if (!this.cronapi.maps.isInitialized("")) {
    this.cronapi.maps.init("", 'roadmap', this.cronapi.maps.createLatLngPoint('', ''), '16', function(sender_item) {
        item = sender_item;
    }.bind(this));
  }
}
