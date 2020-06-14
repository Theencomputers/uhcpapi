
# uhcpapi
A expansion for placeholder API that was designed to be used in UHC.
## Usage:
Most plugins or skripts will have the placeholder put into precents '%placeholder%' but some use curly brackets '{placeholder}'

**%uhcpapi_prefix%**: outputs the team color prefix e.g if the players team is blue this will become §9
Original:
%PREFIX% %NICK%:%MESSAGE%

Using the team color prefix:
%PREFIX% %uhcpapi_prefix%%NICK%:%MESSAGE%

**%uhcpapi_borderradiusworld-<worldname>%**: outputs the radius of the 1.8 worldborder this could be very useful if your uhc timer plugin supports placeholder api so you could let the players know where the border is either in a scoreboard or the players actionbar.
  
### Original:
"&aMeetup is here head to the surface!"

Using borderradius
"&aMeetup is here border at +/- %uhcpapi_borderradiusworld-uhc%" (outputs the radius of the border in world 'uhc')

**%uhcpapi_borderdiameterworld-<worldname>%**: outputs the diameter of the 1.8 worldborder basically the same as the last but incase you want the diameter not radius
  
Original:
"Border is shrinking! Head towards 0, 0"

Using borderdiameter:
"Border %uhcpapi_borderdiameterworld-uhc% x %uhcpapi_borderdiameterworld-uhc%" (outputs the border diameter we use it twice so it outputs 1000 x 1000)

## installation:
- Make sure you have placeholder API installed
- Then open you Placecholder API file on your server and locate "Expansions"
- Then drop this jar file into the Expansions folder and do "/papi reload" in-game
- Edit the configuration files of the plugins you want to use this palceholder and restart
